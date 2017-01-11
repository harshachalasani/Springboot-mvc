var empapp = angular.module("employeeRegistration",[]);

empapp.controller("EmpRegistrationController",["$scope","$http",function EmpRegistrationController($scope,$http){
	
	$scope.addEmployee=function addEmployee(employee){
		console.log('employee',employee);
		$http({
			  method: 'POST',
			  url: 'http://localhost:8080/create',
			  data:employee
			}).then(function successCallback(response) {
				alert("Employee added");
			  }, function errorCallback(response) {
			    alert("error" + response.error);
			  });
	};
}]);