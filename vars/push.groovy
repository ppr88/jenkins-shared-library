#!/user/bin/env groovy

def call(String imageName) {
    echo "Pushing docker image to dockerhub..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh "echo '${env.PASS}' | docker login -u '${env.USER}' --password-stdin"
        sh "docker push $imageName"
    }
}