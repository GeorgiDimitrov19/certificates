node {
   stage('Preparation') { 
      checkout([$class: 'GitSCM',
                branches: [[name: '*/master']],
                doGenerateSubmoduleConfigurations: false,
                extensions: [], submoduleCfg: [],

      userRemoteConfigs: [[url: 'https://github.com/GeorgiDimitrov19/sampleApplication']]])
   }
   stage('Build') {
     withCredentials([sshUserPrivateKey(credentialsId: 'jenkins-key', keyFileVariable: '', passphraseVariable: '', usernameVariable: '')]) {
      sh label: '',
     returnStdout: true,
             script: 'ansible-playbook -u vagrant /var/lib/jenkins/workspace/MyPipeline8-from-git/https-nginx-proxy-tomcat.yml'

    }
   }  
}
