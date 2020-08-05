pipeline {
    stages {
        stage('Example Build') {
            steps {
                echo 'mvn -B clean verify'
            }
        }
    }
}