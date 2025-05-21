

Public int walkDogs(int hour){
        int totalDogs = company.numAvailableDogs(hour);
        int dogsWalked = totalDogs;
        if(totalDogs >maxDogs){
            dogsWalked == maxDogs;
        }
        company.updateDogs(hour,dogsWalked);
        return dogsWalked;
    }
