def gv //gloabal variable available to all stages

pipeline {
    agent any
     environment {  SERVER_CREDENTIAL_VAR = credentials('Harsh-Git') } 
     parameters {
        string(name: 'VERSION', defaultValue: '', description: 'This version for Prod')
        text(name: 'APP', defaultValue: 'APP.COM', description: 'information about the APP')
        booleanParam(name: 'isIt_var', defaultValue: true, description: 'Toggle this value')
        choice(name: 'VERSION', choices: ['1.0', '2.0', '3.0'], description: 'Select Your Version ')
        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
    }
    stages {
        stage('init') {
            steps{ script { gv = load "script.groovy" }}
        }
       
        stage('Build') { 
            steps{script { gv.buildApp() }}
        }
        
        stage('Deploy') {  
            when{ expression { BRANCH_NAME == 'Dev'}} //Execute when Branch name "Dev" Execute
            steps{ script { gv.deployApp()}}
        } 
        stage('Test') {
            when { expression { params.isIt_var } }
            steps{script { gv.testApp() } }
        }
    }
    
    post
    {
        always { echo 'Execute always'}
        failure {echo 'execute when failure'}
        success{echo 'execute when success'}
    }
}
