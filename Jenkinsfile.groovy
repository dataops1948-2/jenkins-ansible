pipeline {
    agent { master } 
    stages {
        stage('Example Build') {
            steps {
                echo 'mvn -B clean verify'
            }
        }
    }
}