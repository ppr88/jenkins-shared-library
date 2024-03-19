#!/user/bin/env groovy

def call() {
    echo "Building the application..."
    sh "docker build -t ppr88/devops-bootcamp-module08:${env.APP_VERSION} ."
}