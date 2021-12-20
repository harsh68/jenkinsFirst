pipeline {
    agent any
   environment { 
               
               SERVER_CREDENTIAL = credentials('Harsh-Git')
    } 
    stages {
        stage('Build') { 
            steps
               {
                   echo 'Build stage'
                      withCredentials([
                                       usernamePassword(credentialsId: 'Harsh-Git', passwordVariable: PWD, usernameVariable: USER)
                                      ])
                                  {
                                      sh "Usename is ${USER}"
                                  }
               } 
        }
        
        stage('Deploy') {  
            when{
                  expression
                   {
                      BRANCH_NAME == 'Dev'
                   }
                }
              steps { echo "Environmental Own Variable  ${SERVER_CREDENTIAL}" }  } //Execute when Branch name "Dev" Execute
        
        stage('Test') {  steps {   echo 'Test stage' }  }
    }
    
    post
    {
        always { echo 'Execute always'}
        failure {echo 'execute when failure'}
        success{echo 'execute when success'}
    }
}
