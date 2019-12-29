node {
  stage('SCM Checkout'){
    git 'https://github.com/galwurm/demo.git'
   }
   
  stage('Mvn Package'){
	   // Build using mave
	   sh 'mvn package'
   }
}
