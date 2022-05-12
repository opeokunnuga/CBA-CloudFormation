
pipeline {
  agent any
  stages {
    stage('Submit Stack') {
      steps {
        sh "aws cloudformation create-stack --stack name s3bucket --template-body file://S3bucketauto.yml --region 'eu-west-2'"
      }
    }
  }
}