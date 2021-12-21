def deployApp()
{
  echo 'Environmental Own Variable  ${SERVER_CREDENTIAL_VAR}'
}

def buildApp()
{
  echo 'Build stage'
}
def testApp()
{
   echo 'Test stage'
   echo 'Deploying version ${params.VERSION}'
}
return this
