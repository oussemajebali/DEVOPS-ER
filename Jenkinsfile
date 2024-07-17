pipeline {
    agent any
    environment {
        SONAR_HOST_URL = 'http://192.168.50.4:9000'
        SONAR_LOGIN = 'a7c268d06ef1c9b0d4e486389261605735ec85f3'
    }

    stages {
        stage('Clean Workspace') {
            steps {
                deleteDir()
            }
        }
        stage('Github') {
            steps {
                // Checkout the project from GitHub
                git branch: 'oussema', url: 'https://github.com/oussemajebali/DEVOPS-ER'
            }
        }
        stage('Maven  Clean Project') {

            steps {

                sh 'mvn clean'

            }

        }
        stage('Maven Compile Project') {

            steps {

                sh 'mvn compile'

            }

        }

        stage('Run JUnit Tests') {

            steps {

                sh 'mvn test'

            }

        }

        stage('Code Quality Analysis SONAR') {

            steps {
               sh 'mvn sonar:sonar -Dsonar.host.url=$SONAR_HOST_URL -Dsonar.login=$SONAR_LOGIN'
               }

        }

    }

}
