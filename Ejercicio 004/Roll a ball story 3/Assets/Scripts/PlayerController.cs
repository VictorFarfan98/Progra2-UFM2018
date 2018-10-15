using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class PlayerController : MonoBehaviour {

    public float speed;
    private Rigidbody rb;
    public int count;
    public Text counText;
    public Text WinText;
	public Text ColorText;
	//public Material[] listMaterials = new Material[3];
	public List<Material> listMaterials = new List<Material>(5);
	private Material curMaterial;
	public Text pruebas;

	private int blueCounter = 0;
	private int purpleCounter = 0;
	private int redCounter = 0;

	private void Start()
	{
		Debug.Log("Started Player Controller");
		rb = GetComponent<Rigidbody>();
		count = 0;
		counText.text = "Count:" + count.ToString();
		if (count >= 20)
		{
			WinText.text = "Winner";
		}
		WinText.text = "";
		int index = Random.Range(0, 3);
		curMaterial = listMaterials[index];
		ColorText.text = curMaterial.name;
		ColorText.material = curMaterial;
		ColorText.material.shader = Shader.Find("UI/Default");


		
    }

	private void Update()
	{
		
	}


    private void FixedUpdate()
    {
        float moveHorizontal = Input.GetAxis("Horizontal");
        float moveVertical = Input.GetAxis("Vertical");
		float jump = Input.GetAxis("Jump");

        Vector3 movement = new Vector3(moveHorizontal, jump * 2, moveVertical);
        rb.AddForce(movement * speed);

		blueCounter = GameObject.FindGameObjectsWithTag("Pick Up Blue").Length;
		redCounter = GameObject.FindGameObjectsWithTag("Pick Up Red").Length;
		purpleCounter = GameObject.FindGameObjectsWithTag("Pick Up Purple").Length;
		//Debug.Log("Red counter: " + redCounter);
		//Debug.Log("Blue counter: " + blueCounter);
		//Debug.Log("Purple counter: " + purpleCounter);
	}



    private void OnTriggerEnter(Collider other)
    {
        if(other.gameObject.CompareTag("Pick Up Blue") || other.gameObject.CompareTag("Pick Up Red") || other.gameObject.CompareTag("Pick Up Purple"))
        {
			//Debug.Log(other.GetComponent<Renderer>().material.name);
			

			if(other.GetComponent<MeshRenderer>().material.name == curMaterial.name + " (Instance)")
			{
				Destroy(other.gameObject);
				pruebas.text = other.GetComponent<MeshRenderer>().material.name ;
				
				count = count + 1;
				counText.text = "Count:" + count.ToString();
			}
			else
			{
				pruebas.text = other.GetComponent<MeshRenderer>().material.ToString();
				Destroy(other.gameObject);

				if (count > 0) {					
					count = count - 1;
					counText.text = "Count:" + count.ToString();
				}
				
			}

            

			removeUnusedPrefab();
			Debug.Log("Numero de opciones: " + listMaterials.Count);
			if (listMaterials.Count > 0)
			{
				curMaterial = listMaterials[Random.Range(0, listMaterials.Count)];
				ColorText.text = curMaterial.name;
				ColorText.material = curMaterial;
				ColorText.material.shader = Shader.Find("UI/Default");
			}
			else
			{
				Debug.Log("Ya gano");
				WinText.text = "Winner";
			}
			
		}//End if gameobject is pickup 

		
    }
	private void removeUnusedPrefab()
	{
		if (redCounter == 1)
		{
			Debug.Log("Ya no hay rojos");
			for (int i = 0; i < listMaterials.Count; i++)
			{
				if (listMaterials[i].name == "Red")
				{
					Debug.Log(listMaterials[i].name);
					listMaterials.RemoveAt(i);
				}
			}
		}

		if (blueCounter == 1)
		{
			Debug.Log("Ya no hay azules");
			for (int i = 0; i < listMaterials.Count; i++)
			{
				if (listMaterials[i].name == "Blue")
				{
					Debug.Log(listMaterials[i].name);
					listMaterials.RemoveAt(i);
				}
			}
		}

		if (purpleCounter == 1)
		{
			Debug.Log("Ya no hay morados");
			for (int i = 0; i < listMaterials.Count; i++)
			{
				if (listMaterials[i].name == "Purple")
				{
					Debug.Log(listMaterials[i].name);
					listMaterials.RemoveAt(i);
				}
			}
		}
	}

}

