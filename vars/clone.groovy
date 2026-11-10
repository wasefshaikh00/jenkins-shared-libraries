def call(String url,string branch){
  echo "this is a cloning the code"
                git url:"${url}",branch:"${branch}"
                echo "code cloning successfull"
}
