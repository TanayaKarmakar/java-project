pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Deploy') {
            steps {
               deploy adapters: [tomcat9(credentialsId: '1d55f2d5-b01c-4031-a2da-e45ae97edc27', path: '', url: 'http://localhost:9090/')], 
               contextPath: null, 
               war: '**/simple-app.war'
            }
        }
    }
}
