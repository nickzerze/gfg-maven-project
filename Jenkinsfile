pipeline
{
	agent any
	tools
	{
		maven 'MAVEN_HOME'
	}
	
	stages
	{
		stage('Welcome Stage')
		{
			steps
			{
				echo 'Welcome to Jenkins Pipeline'
			}
		}
		
		stage('Cleaning Stage')
		{
			steps
			{
				bat 'mvn clean'
			}
		}
		
		stage('Testing Stage')
		{
			steps
			{
				bat 'mvn test'
			}
		}		
		
		
		stage('Build Stage')
		{
			steps
			{
				bat 'mvn install'
			}
		}		
		
		stage('Build Success')
		{
			steps
			{
				echo 'Build Successful'
			}
		}
		
	}
}