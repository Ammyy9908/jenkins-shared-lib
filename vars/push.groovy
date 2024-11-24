def call(String Project,String ImageTag,String dockerhubUser){
                 withCredentials([usernamePassword('credentialsId':"DockerHubCred",
                passwordVariable:"dockerhubpass",
                usernameVariable:"dockerhubUser")]){
                     sh "docker login -u ${dockerhubUser} -p ${dockerhubpass}"
                     sh "docker push ${dockerhubUser}/${Project}:${ImageTag}"
                     
                }
                
}

