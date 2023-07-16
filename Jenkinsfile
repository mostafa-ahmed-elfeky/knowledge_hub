node {
  stage("Clone the project") {
    git branch: 'master', url: 'https://github.com/mostafa-ahmed-elfeky/knowledge_hub.git'
  }

  stage("Compilation") {
    sh "./mvnw clean install -DskipTests"
  }

  stage("Deployment") {
    stage("Deployment") {
      sh 'nohup ./mvnw spring-boot:run -Dserver.port=8001 &'
    }
  }
}