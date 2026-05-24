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

                sh 'mvn clean compile'

            }

        }

        stage('Test') {

            steps {

                sh 'mvn test'

            }

        }

        stage('Package') {

            steps {

                sh 'mvn clean package'

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
