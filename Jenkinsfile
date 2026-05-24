pipeline {

    agent any

    tools {

        jdk 'JDK21'

    }

    stages {

        stage('Checkout') {

            steps {

                git branch: 'main',
                url: 'https://github.com/ravish142000/employee-service.git'

            }

        }

        stage('Build') {

            steps {

                bat 'mvn clean compile'

            }

        }

        stage('Test') {

            steps {

                bat 'mvn test'

            }

        }

        stage('Package') {

            steps {

                bat 'mvn clean package'

            }

        }

    }

    post {

        success {

            echo 'Pipeline Success'

        }

        failure {

            echo 'Pipeline Failed'

        }

    }

}
