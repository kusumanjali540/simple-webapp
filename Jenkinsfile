pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/<your-username>/simple-webapp.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Run') {
            steps {
                sh 'nohup java -jar target/simple-webapp-0.0.1-SNAPSHOT.jar &'
            }
        }
    }
}
