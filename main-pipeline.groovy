node {
   stage('Preparation') { 
      checkout([$class: 'GitSCM',
                branches: [[name: '*/master']],
                doGenerateSubmoduleConfigurations: false,
                extensions: [], submoduleCfg: [],

      userRemoteConfigs: [[url: 'https://github.com/GeorgiDimitrov19/sampleApplication']]])
   }
   stage('Build') {
     sh label: '',
     returnStdout: true,
             script: 'ssh vagrant@192.168.48.176'

    }
}
