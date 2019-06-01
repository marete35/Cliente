var cLogger = {
		
	log:function(data,obj){
		if(permiteLogJS == 'S'){
			if (obj == undefined){
				console.log(data);
			}else{
				console.log(data,obj)
			}
		}
	},
	info:function(data,obj){
		if(permiteLogJS == 'S'){
			if(obj == undefined){
				console.info(data)
			}else{
				console.info(data,obj);
			}
		}
	},
	warn:function(data,obj){
		if(permiteLogJS == 'S'){
			if(obj == undefined){
				console.warn(data);
			}else{
				console.warn(data,obj);
			}
		}
	},
	error:function(data){
		if(permiteLogJS == 'S'){
			if(obj == undefined){
				console.error(data);
			}else{
				console.error(data,obj);
			}
		}
	},
	count:function(data){
		if(permiteLogJS == 'S'){
			console.count(data);
		}
	},
	table:function(data){
		if(permiteLogJS == 'S'){
			console.table(data);
		}
	},
	trace:function(){
		if(permiteLogJS ==  'S'){
			console.trace();
		}
	},
	groupCollapsed:function(label){
		if(permiteLogJS == 'S'){
			console.groupCollapsed(label);
		}
	},
	groupEnd:function(label){
		if(permiteLogJS == 'S'){
			console.groupEnd(label);
		}
	}
}