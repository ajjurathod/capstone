def call(){
  sh "docker build -t ajay-imge ."
  sh "docekr run -td --name ajay-cont -p 80:80 ajay-image"
}
