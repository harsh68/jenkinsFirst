pipeline {
    agent any
    environment { 
                AOEU = "${sh(returnStdout: true, script: 'echo aoeu').trim()}"
               SERVER_CREDENTIAL = credentials('ID REFERENCE OF JENKINS CREDENTAIL')
    }   
    stages {
        stage('Build') {  steps {   echo 'Build stage' }  }
        
        stage('Deploy') {  
            when{
                  expression
                   {
                      BRANCH_NAME == 'Dev'
                   }
                }
              steps {   echo 'Deploy stage'  echo 'Environmental Own Variable  ${SERVER_CREDENTIAL}' }  } //Execute when Branch name "Dev" Execute
        
        stage('Test') {  steps {   echo 'Test stage' }  }
    }
    
    post
    {
        always { echo 'Execute always'}
        failure {echo 'execute when failure'}
        success{echo 'execute when success'}
    }
}
