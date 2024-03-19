#!/user/bin/env groovy

def call() {
    echo "Testing the application..."
    sh "docker run node_app npm test"
}