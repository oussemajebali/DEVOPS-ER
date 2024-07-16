pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the 'oussema' branch
                git branch: 'oussema', url: 'https://github.com/oussemajebali/DEVOPS-ER'
            }
        }

        stage('Build') {
            steps {
                // Compile the Maven project
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run unit tests with Maven
                sh 'mvn test'
            }
        }

    }

}
