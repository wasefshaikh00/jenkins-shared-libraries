def call(String ProjectName, String ImageTag, String DockerHubUser){
    withCredentials([usernamePassword(credentialsId: 'dockerHubcred', passwordVariable: 'dockerhubPass', usernameVariable: 'dockerHubUser')]) {
        sh "docker login -u ${env.dockerHubUser} -p ${env.dockerhubPass}"
        sh "docker push ${DockerHubUser}/${ProjectName}:${ImageTag}"
    }
}
