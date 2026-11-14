def call(String Project, String ImageTag, String dockerhubuser){
withCredentials ([username Password (credentialsId: 'dockerHubcred', passwordVariable: 'dockerhubPass', usernameVariable: 'dockerHubUser')]) {   
  sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
}
sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
