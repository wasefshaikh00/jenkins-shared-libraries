def call(String ProjectName,string ImageTag,String DockerHubUser){
  sh"docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag ."
}
