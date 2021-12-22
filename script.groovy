def deployApp()
{
  echo 'Environmental Own Variable  ${SERVER_CREDENTIAL_VAR}'
}

def buildAppOne()
{
  echo 'Build-One stage'
}
def buildAppTwo()
{
  echo 'Build-Two stage'
}

def testApp()
{
   echo 'Test stage'
   echo 'Deploying version ${params.VERSION}'
}
return this
