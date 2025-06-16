pipeline {
    agent any

    tools {
        maven 'Maven'  
    }

    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/kusumanjali540/simple-webapp.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying to local server...'
                // Start the JAR in background and redirect logs
                bat '''
                for %%f in (target\\*.jar) do (
                    start /min cmd /c "java -jar %%f > springboot.log 2>&1"
                )
                '''
                // Wait for app to start
               bat 'ping -n 10 127.0.0.1 >nul'
                // Print application logs to Jenkins console
                bat 'type springboot.log'
                // Try accessing the app via curl
                bat 'curl http://localhost:8080 || echo Unable to connect'
            }
        }
    }
}
