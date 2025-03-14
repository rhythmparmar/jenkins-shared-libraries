def call(){
  sh "docker compose up --build"
  echo "deployment successful"
}
