def call(){
  echo  "Pushing code to docker hub"
  withcredentials([usernamePassword("credentialsId":"DockerHubCred", usernameVariable:"dockerHubUser", passwordVariable:"dockerHubPass")]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    sh "docker push rhythmparmar/"
  }
 
}
