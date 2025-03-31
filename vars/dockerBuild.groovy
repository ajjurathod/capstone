def call(){
  sh "docker build -t ajay-imge ."
  sh "docker run -td --name ajay-cont -p 80:80 ajay-image"
}
