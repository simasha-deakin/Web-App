pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                // For example, for a Node.js app:
                sh 'npm install'
                sh 'npm run build'  // or your build command

                // Alternatively, if Java project:
                // sh './gradlew build'
                
                // For Docker image build (if applicable):
                // sh 'docker build -t math-quiz-app:latest .'
            }
            post {
                success {
                    archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
                    // or for Docker, save image to archive or push to registry
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Running automated tests...'
                // Example for Node.js Jest tests:
                sh 'npm test'

                // Or for Java with JUnit:
                // sh './gradlew test'
            }
            post {
                always {
                    junit '**/build/test-results/test/*.xml'  // adjust path based on your test reports
                }
            }
        }

        stage('Code Quality') {
            steps {
                echo 'Running code quality analysis...'
                // Add SonarQube scan commands or other tools
            }
        }

        stage('Security') {
            steps {
                echo 'Running security scans...'
                // Run security scanning tools here
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment scripts here (e.g., to a server or cloud)
            }
        }

        stage('Release') {
            steps {
                echo 'Releasing the application...'
                // Tag release or push docker image to registry
            }
        }

        stage('Monitoring') {
            steps {
                echo 'Starting monitoring...'
                // Configure monitoring or alerting here
            }
        }
    }
}
