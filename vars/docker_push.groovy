def call(String username, String imagename, String tag){
  echo  "Pushing code to docker hub"
  withCredentials([usernamePassword("credentialsId":"DockerHubCred", usernameVariable:"dockerHubUser", passwordVariable:"dockerHubPass")]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }

  sh "docker push ${username}/${imagename}:${tag}"
  echo "Image pushed to Dockerhub successfully"
}
