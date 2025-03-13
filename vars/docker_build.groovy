def call(String imagename, String username, String tag){
  echo "This is building of code"
  sh "docker build -t ${username}/${imagename}:${tag} ."
  echo "code built successfully"
}
