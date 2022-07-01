    package com.example.demo;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.RestController;

    import java.io.IOException;
    import java.util.*;

    @RestController
    public class ControllerPoi{

        @Autowired
        DestinationService destinationService;


        static double latitudine;
        static double longitudine;
        static FilterBounds filterBounds;
        static String destinationType;
        static int limitPoi;


        @GetMapping("/getpoilist/")
        public Results getPoi(@RequestParam(value= "southwestLat") String southwestLat,
                              @RequestParam(value= "southwestLng") String southwestLng,
                              @RequestParam(value = "northeastLat") String northeastLat,
                              @RequestParam(value = "northeastLng") String northeastLng,
                              @RequestParam(value = "pageSize", required = false, defaultValue = "100") String pageSize,
                              @RequestParam(value = "type", required = false) String type,
                              @RequestParam(value = "startDate", required = false) Date startDate,
                              @RequestParam(value = "endDate", required = false) Date endDate,
                              @RequestParam(value = "filters", required = false) String filters,
                              @RequestParam(value = "accountId") String accountId,
                              @RequestParam(value = "language", required = false) String language) throws IOException {

          List<Destinations> destinationsBounds = new ArrayList<>();
          destinationType = type;
          limitPoi = Integer.parseInt(pageSize);
          latitudine= (Double.parseDouble(northeastLat)+ Double.parseDouble(southwestLat))/2;
          longitudine= (Double.parseDouble(northeastLng)+ Double.parseDouble(southwestLng))/2;
          List<Destinations> lista = destinationService.readPoiJson();
          filterBounds = new FilterBounds(new Geometry(Double.parseDouble(southwestLat),Double.parseDouble(southwestLng)),new Geometry(Double.parseDouble(northeastLat),Double.parseDouble(northeastLng)));
          destinationService.getPoi(lista,destinationsBounds);
          Collections.sort(destinationsBounds, new Compare());
            elimina(destinationsBounds);
            return new Results(pageSize, destinationsBounds.size(),1,destinationsBounds,"OK");

        }


        private void elimina(List<Destinations> lista){
            for(int i =0 ; i<lista.size();i++){
                if(i>limitPoi-1){
                    lista.remove(lista.get(i));
                    i--;
                }
            }
        }

    }

