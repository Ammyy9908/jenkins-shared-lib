def call(url:String,branch:String){
     echo "Cloning Code"
     git url:"${url}",branch:"${branch}"
     echo "Cloned"
}