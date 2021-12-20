pipeline {
    agent any
    
    stages {
        stage('Build') {  steps {   echo 'Build stage' }  }
        
        stage('Deploy') {  
            when{
                  expression
                   {
                      BRANCH_NAME == 'Dev'
                   }
                }
              steps {   echo 'Deploy stage'  }  } //Execute when Branch name "Dev" Execute
        
        stage('Test') {  steps {   echo 'Test stage' }  }
    }
    
    post
    {
        always { echo 'Execute always'}
        failure {echo 'execute when failure'}
        success{echo 'execute when success'}
    }
}
