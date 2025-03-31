def call(){
  sh "sudo docker build -t ajay-imge ."
  sh "sudo docekr run -td --name ajay-cont -p 80:80 ajay-image"
}
