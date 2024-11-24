def call(String url,String branch){
     echo "Cloning Code"
     git url:"${url}",branch:"${branch}"
     echo "Cloned"
}