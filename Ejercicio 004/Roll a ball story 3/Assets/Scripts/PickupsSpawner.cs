using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PickupsSpawner : MonoBehaviour {
	public GameObject topick;

	public float zrange_min = -9f;
	public float zrange_max = 10f;

	public float xrange_min = -7.5f;
	public float xrange_max = -7.5f;

	public float ycoordinate = 0f;

	public Material[] myColors = new Material[3];
	public GameObject[] myPickUps = new GameObject[3];

	// Use this for initialization
	void Start () {
		SpawnEnemy();
		
	}
	
	// Update is called once per frame
	void Update () {
		
	}

	void SpawnEnemy()
	{ 
		for (int i = 1; i <= 10; i++)
		{
			// Call instantiate here
			Vector3 planepos;
			if (i%2 == 0)
			{
				planepos = new Vector3(Random.Range(xrange_min, 0), ycoordinate, Random.Range(zrange_min, zrange_max));
			}
			else
			{
				planepos = new Vector3(Random.Range(0, xrange_max), ycoordinate, Random.Range(zrange_min, zrange_max));
			}
			Instantiate(myPickUps[i % 3], planepos, transform.rotation);
			//Debug.Log("pos:" + planepos);
			//GameObject newpickup = Instantiate(topick, planepos, transform.rotation);
			//newpickup.GetComponent<Renderer>().material = myColors[i % 3]; 
		}
		Debug.Log("Finished Spawning");
	}
}
