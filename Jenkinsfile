pipeline {
    agent any
    stages {
        stage('Build') {  steps {   echo 'Build stage' }  }
        stage('Deploy') {  steps {   echo 'Deploy stage' }  }
        stage('Test') {  steps {   echo 'Test stage' }  }
    }

    post { 
        always {  //always execute script  }
        success{  //always execute script  }
        failure{  //always execute script  }
    }
    }
}
