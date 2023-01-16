#!/usr/bin/env groovy

deff call(){
  input message:'terraform destroy?',ok:'yes',
                 sh("terraform -auto-approve")
                 }
