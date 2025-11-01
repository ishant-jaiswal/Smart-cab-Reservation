from flask import Flask, request, jsonify
from sklearn.cluster import KMeans
import numpy as np

app = Flask(__name__)

@app.route('/cluster', methods=['POST'])
def cluster_users():
    data = request.get_json()
    users = data.get('users', [])

    if not users:
        return jsonify({'error': 'No user data provided'}), 400

    # Convert user data into numeric array: [pickup_lat, pickup_lon, dest_lat, dest_lon, time]
    X = np.array([u['pickup'] + u['dest'] + [u['time']] for u in users])

    # Run K-Means clustering (3 groups)
    kmeans = KMeans(n_clusters=3, random_state=42)
    labels = kmeans.fit_predict(X)

    # Return cluster labels
    return jsonify({'clusters': labels.tolist()})

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
