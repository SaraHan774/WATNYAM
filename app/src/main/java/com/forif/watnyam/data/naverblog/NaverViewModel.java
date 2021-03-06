package com.forif.watnyam.data.naverblog;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.forif.watnyam.model.NaverData;

import java.util.ArrayList;

public class NaverViewModel extends ViewModel {

    private NaverSearchRepository naverSearchRepository;

    public NaverViewModel(){
        naverSearchRepository = NaverSearchRepository.getInstance();
    }

    public void fetchNaverSearchResults(String query){
        naverSearchRepository.fetchNaverResultAsync(query);
    }

    public MutableLiveData<ArrayList<NaverData>> getMutableLiveNaverData(){
        return naverSearchRepository.getMutableLiveNaverData();
    }
}
