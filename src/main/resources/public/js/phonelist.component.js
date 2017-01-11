angular.module('phonecatApp',[]).component('phonelist',{
	// to write a template
	//template:'<ul>'+
	//		'<li ng-repeat="phone in $ctrl.phones">'+
	//		'<span> {{phone.name}}</span>'+
	//		'<p>{{phone.snippet}}</p>'+
	//		'</li>'+
	//	'</ul>',
	templateUrl:'phonelist/phonelist.template.html',
	controller: function PhoneListController() {
		this.phones=[
	{
      name: 'Nexus S',
      snippet: 'Fast just got faster with Nexus S.',
      age:1
    }, {
      name: 'Motorola XOOM™ with Wi-Fi',
      snippet: 'The Next, Next Generation tablet.',
      age:3
    }, {
      name: 'MOTOROLA XOOM™',
      snippet: 'The Next, Next Generation tablet.',
      age:2
    }
    ];
    this.orderProp = 'age';
	}
});