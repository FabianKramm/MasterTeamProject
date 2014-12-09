package api.process.buildingblock;

import com.hp.hpl.jena.rdf.model.Model;

import api.ProcessModel;


public class Activity extends Node
{
    static String type = "Activity";


    public Activity(ProcessModel process)
    {
        super(process);
    }


    @Override
    public void addToModel(Model m)
    {
        addToModel2(m, type);
    }

}
