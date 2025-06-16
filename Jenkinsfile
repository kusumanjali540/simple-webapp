pipeline {
    agent any

    tools {
        maven 'Maven'  // Match this with your Jenkins tool name
    }

    stages {
        stage('Clone Repo') {
            steps {
                git 'https://github.com/kusumanjali540/simple-webapp.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying to local server...'
                sh 'nohup java -jar target/*.jar &'
            }
        }
    }
}
