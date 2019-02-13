node {
   def mvnHome
   stage('Preparation') { 
       checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/GeorgiDimitrov19/sampleApplication']]])
   }
   stage('Build') {
     sh label: '', returnStdout: true, script: 'ansible-playbook -u vagrant /var/lib/jenkins/workspace/MyPipeline6/download-war.yml'
    
   }
   stage('Results') {
       
   }
}
