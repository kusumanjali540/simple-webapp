pipeline {
    agent any

    tools {
        maven 'Maven'  // Make sure 'Maven' is defined in Jenkins global tools
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
                bat '''
                for %%f in (target\\*.jar) do (
                    start /b java -jar %%f
                )
                '''
            }
        }
    }
}
